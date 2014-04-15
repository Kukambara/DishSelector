package ua.nure.dao;

import org.hibernate.Session;
import ua.nure.entity.History;
import ua.nure.util.HibernateUtilMain;

import java.util.List;

/**
 * Created by Dmitry on 15.04.2014.
 */
public class HistoryDao extends GenericDao<History> {

    public HistoryDao() {
        super(new History());
    }
}
