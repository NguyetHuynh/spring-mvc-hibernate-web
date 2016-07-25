package nguyethuynh;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;

public class ENewsDao {
	
	SessionFactory template;  
	Session session;

	public ENewsDao() {
		template = HibernateUtil.getSessionFactory();
		session = template.openSession();
	}

	public List<ENews> getListENews()
	{
		session.beginTransaction();
		List<ENews> list = new ArrayList<ENews>();
		Criteria cr = session.createCriteria(ENews.class);
		cr.addOrder(Order.desc("id"));
		list = cr.list();
		session.getTransaction().commit();
		return list;
	}
	
}
