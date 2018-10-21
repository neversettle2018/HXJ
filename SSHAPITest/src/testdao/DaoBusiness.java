package testdao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.chainsaw.Main;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import testentity.*;

@Transactional
public class DaoBusiness extends HibernateDaoSupport {
	@SuppressWarnings("unchecked")
	public List<Users> getAllTrousers()
	{
		return (List<Users>) getHibernateTemplate().find(
				"from Users");
	}
	

}
