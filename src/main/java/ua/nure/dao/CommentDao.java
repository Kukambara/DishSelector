package ua.nure.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import ua.nure.entity.Comment;
import ua.nure.entity.Recipe;
import ua.nure.entity.User;
import ua.nure.util.HibernateUtilMain;

import java.util.List;

/**
 * Created by Dmitry on 15.04.2014.
 */
public class CommentDao extends GenericDao<Comment> {

    public CommentDao() {
        super(new Comment());
    }

    public List<Comment> getComments(Integer recipeId) {
        try {
            Session session = HibernateUtilMain.getSessionFactory().openSession();
            Query query = session.createQuery("from Comment where recipe.recipeId = :id");
            query.setParameter("id", recipeId);
            List comments = query.list();
            session.close();
            return comments;
        } catch (Exception e) {
            System.out.println("getComments(Integer id) Error = " + e.getCause());
        }
        return null;
    }

    public void remove(Integer id) {
        Transaction tx = null;
        try {
            Session session = HibernateUtilMain.getSessionFactory().openSession();
            tx = session.beginTransaction();
            Query query = session.createQuery("delete Comment where  commentId =:id");
            query.setParameter("id", id);
            query.executeUpdate();
            tx.commit();
            session.close();
        } catch (Exception e) {
            System.out.println("deleteComment(Integer id) Error = " + e.getCause());
        }
    }
}
