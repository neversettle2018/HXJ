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
		//这是一个标识的方法，我的理解是相当与id
	}
    
	//测试后置通知注解能不能两个方法
	@Pointcut("execution(* springaop.PersonServerBean.save(..))")
    private void save(){
		//这是一个标识的方法，我的理解是相当与id
	}
	@Pointcut("execution(* springaop.PersonServerBean.getPersonName(..))")
    private void getPersonName(){
		//这是一个标识的方法，我的理解是相当与id
	}
	
	
	
	
    @Before("execution(* springaop.PersonServerBean.update(..))")
    public void doAccessCheck() {
        System.out.println("前置通知");
    }
    @After("anyMethod()")    //在这个方法之后要执行下面after()这个方法
    public void after() {
        System.out.println("最终结果");
    }
    @AfterReturning("save(),getPersonName()")
    public void doAfter() {
        System.out.println("后置通知");
    }
    @AfterThrowing("anyMethod()")
    public void doAfterThrow() {
        System.out.println("例外通知");
    }
    @Around("anyMethod()")
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("进入环绕通知");
        Object object = pjp.proceed();
        System.out.println("退出方法");
        return object;
    }
}
/* 
 *     <!-- 定义切面 -->
    <bean id="logAspect" class="com.aligns.spring.aop.aop.aspect.TransactionAspect"></bean>
    <!-- aop相关的配置和说明 -->
    <aop:config>
        <!-- 定义相关的切面 -->
        <aop:aspect ref="logAspect">
            <!-- 定义切入点 -->
            <aop:pointcut expression="execution(* com.aligns.spring.aop.service.*.*(..))" id="transactionPointCut"/>
            <aop:before pointcut-ref="transactionPointCut" method="beginTransaction"/>
            <aop:after pointcut-ref="transactionPointCut" method="CommitTransaction"/>
            <aop:after-throwing pointcut-ref="transactionPointCut" method="rollBackTransaction"/>       
        </aop:aspect>

    </aop:config>
   */
