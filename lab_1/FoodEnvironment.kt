package lab_1

import kotlin.random.Random

class FoodEnvironment(vararg agents: Actor) : Environment(*agents) {

    val scores: MutableMap<Actor, Int> = mutableMapOf()//initialization
    var animal:String? = null

    init {
        for(agent in agents){
            scores[agent] = 0
        }
    }

    override fun step() {
        val random = Random.nextDouble(0.0,100.0)
        animal = if(random <= 0.0 ) null else "Hen"
        println(random)
        super.step()
    }

    override fun processAction(agent: Actor, act: Action) {
        if(scores.containsKey(agent)){
            if(act is ForageAction){
                scores[agent] = scores[agent]?.plus(1)?: 0
            }
        }
    }

    override fun sense(agent: Actor) {
        if(animal == null)
          agent.perceive()
        else{
            Percept("animal", animal!! )
        }
    }

}