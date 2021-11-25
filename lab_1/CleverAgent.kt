package lab_1

class CleverAgent(override val name: String, ) : Actor {
    val percept: Percept? = null

    override fun act(): Action {
         return if(percept == null) ForageAction() else HuntAction(percept.value)
    }

    override fun perceive(vararg facts: Percept) {
        TODO("Not yet implemented")
    }
}