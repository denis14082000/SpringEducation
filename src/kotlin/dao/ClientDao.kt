package dao

import entities.Client
import org.hibernate.cfg.Configuration
import org.springframework.stereotype.Service
import javax.transaction.Transactional

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


    fun removeClient(id : Int) : String {
        val session = sessionFactory.openSession()
        val transaction = session.beginTransaction()
        val clientToDelete = session.get(Client::class.java, id)
        session.remove(clientToDelete)
        transaction.commit()
        session.close()
        return "Success"
    }

    fun addClient(name : String) : Client {
        val session = sessionFactory.openSession()
        val transaction = session.beginTransaction()
        val clientToSave = Client(name)
        session.save(clientToSave)
        transaction.commit()
        session.close()
        return clientToSave
    }


    companion object {
        val sessionFactory = Configuration().configure().addAnnotatedClass(Client::class.java).buildSessionFactory()
    }
}