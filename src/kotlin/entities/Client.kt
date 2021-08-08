package entities

import javax.persistence.*

@Entity
@Table(name = "client")
class Client {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Int? = null


    @Column(name = "name")
    private var name : String? = null

    override fun toString(): String {
        return "\n Client Information" +
                "\n Id: " + id +
                "\n Name: " + name
    }
}