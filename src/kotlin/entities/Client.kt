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

    constructor() {

    }

    constructor(name : String) {
        this.name = name
    }

    override fun toString(): String {
        return "\n Client Information" +
                "\n Id: " + id +
                "\n Name: " + name
    }
}