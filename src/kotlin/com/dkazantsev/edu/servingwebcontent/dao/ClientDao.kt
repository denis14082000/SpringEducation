package com.dkazantsev.edu.servingwebcontent.dao

import com.dkazantsev.edu.servingwebcontent.entities.Client
import org.hibernate.cfg.Configuration
import org.springframework.stereotype.Service

@Service
class ClientDao {
//    fun findClientById(id : Int) : Client {
//        val session = sessionFactory.openSession()
//        val transaction = session.beginTransaction()
//        val client = session.get(Client::class.java, id)
//        transaction.commit()
//        session.close()
//        return client
//    }
//
//    fun findAllClient() : List<Client> {
//        val session = sessionFactory.openSession()
//        val transaction = session.beginTransaction()
//        val client = session.createQuery("FROM Client ").list() as List<Client>
//        transaction.commit()
//        session.close()
//        return client
//    }
//
//
    fun removeClient(client : Client){
        val session = sessionFactory.openSession()
        val transaction = session.beginTransaction()
        val clientToRemove = session.merge(client)
        session.delete(clientToRemove)
        transaction.commit()
        session.close()
    }

    fun addClient(clientToSave : Client) {
        val session = sessionFactory.openSession()
        val transaction = session.beginTransaction()
        session.save(clientToSave)
        transaction.commit()
        session.close()
    }


    companion object {
        val sessionFactory = Configuration().configure().addAnnotatedClass(Client::class.java).buildSessionFactory()
    }
}