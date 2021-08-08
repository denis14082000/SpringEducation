package dao

import entities.Client
import org.hibernate.cfg.Configuration
import org.springframework.stereotype.Service

@Service
class ClientDao {
    fun findClientById(id : Int) : Client {
        val session = sessionFactory.openSession()
        val transaction = session.beginTransaction()
        val client = session.get(Client::class.java, id)
        transaction.commit()
        session.close()
        return client
    }

    fun findAllClient() : List<Client> {
        val session = sessionFactory.openSession()
        val transaction = session.beginTransaction()
        val client = session.createQuery("FROM Client ", Client::class.java).list() as List<Client>
        transaction.commit()
        session.close()
        return client
    }


    companion object {
        val sessionFactory = Configuration().configure().addAnnotatedClass(Client::class.java).buildSessionFactory()
    }
}