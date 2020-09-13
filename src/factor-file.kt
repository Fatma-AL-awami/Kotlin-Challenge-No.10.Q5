
interface Virus{

    fun mutate()
    fun spread()
}
enum class VirusType{  vcorona, vHIV ,vinfluenza }


class CoronaVirus:Virus{
    override fun mutate() {
        println(" coronaVirus class in the fun mutate ")
    }
    override fun spread() {
        println(" coronaVirus class in the spread ")
    }

}
class InfluenzaVirus:Virus{
    override fun mutate() {
        println("influenzaVirus class int the mutate ")
    }
    override fun spread() {
        println("influenzaVirus class int the spread ")
    }

}
class HIVVirus:Virus{
    override fun mutate() {
        println(" HIVVirus class ")
    }
    override fun spread() {
        println(" HIVVirus class ")
    }

}
///factoey class
class VirusFactory{


    fun makeVirus(virusType:VirusType):Virus{
        var  typ:Virus
        if(virusType==VirusType.vcorona)
            typ= CoronaVirus()
        else if(virusType==VirusType.vinfluenza)
            typ=InfluenzaVirus()
        else typ=HIVVirus()
        return typ;


    }
}

fun main() {
    var typ_virus=VirusType.vcorona

    var virusobj=VirusFactory().makeVirus(typ_virus)
    virusobj.mutate()
    virusobj.spread()

}