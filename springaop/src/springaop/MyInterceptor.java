package springaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyInterceptor {
	@Pointcut("execution(* springaop.PersonServerBean.*(..))")
    private void anyMethod(){
		//����һ����ʶ�ķ������ҵ�������൱��id
	}
    
	//���Ժ���֪ͨע���ܲ�����������
	@Pointcut("execution(* springaop.PersonServerBean.save(..))")
    private void save(){
		//����һ����ʶ�ķ������ҵ�������൱��id
	}
	@Pointcut("execution(* springaop.PersonServerBean.getPersonName(..))")
    private void getPersonName(){
		//����һ����ʶ�ķ������ҵ�������൱��id
	}
	
	
	
	
    @Before("execution(* springaop.PersonServerBean.update(..))")
    public void doAccessCheck() {
        System.out.println("ǰ��֪ͨ");
    }
    @After("anyMethod()")    //���������֮��Ҫִ������after()�������
    public void after() {
        System.out.println("���ս��");
    }
    @AfterReturning("save(),getPersonName()")
    public void doAfter() {
        System.out.println("����֪ͨ");
    }
    @AfterThrowing("anyMethod()")
    public void doAfterThrow() {
        System.out.println("����֪ͨ");
    }
    @Around("anyMethod()")
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("���뻷��֪ͨ");
        Object object = pjp.proceed();
        System.out.println("�˳�����");
        return object;
    }
}
/* 
 *     <!-- �������� -->
    <bean id="logAspect" class="com.aligns.spring.aop.aop.aspect.TransactionAspect"></bean>
    <!-- aop��ص����ú�˵�� -->
    <aop:config>
        <!-- ������ص����� -->
        <aop:aspect ref="logAspect">
            <!-- ��������� -->
            <aop:pointcut expression="execution(* com.aligns.spring.aop.service.*.*(..))" id="transactionPointCut"/>
            <aop:before pointcut-ref="transactionPointCut" method="beginTransaction"/>
            <aop:after pointcut-ref="transactionPointCut" method="CommitTransaction"/>
            <aop:after-throwing pointcut-ref="transactionPointCut" method="rollBackTransaction"/>       
        </aop:aspect>

    </aop:config>
   */
