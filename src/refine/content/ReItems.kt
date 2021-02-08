package refine.content

import arc.graphics.Color
import mindustry.ctype.ContentList
import mindustry.type.Item

class ReItems : ContentList {

    override fun load() {
        rawCopper = object : Item("raw-copper", Color.valueOf("d99d73")) {
            init {
                hardness = 1
                alwaysUnlocked = true
            }
        }
        rawLead = object : Item("raw-lead", Color.valueOf("8c7fa9")) {
            init {
                hardness = 1
                alwaysUnlocked = true
            }
        }
        rawTitanium = object : Item("raw-titanium", Color.valueOf("8da1e3")) {
            init {
                hardness = 3
            }
        }
        granite = Item("granite", Color.valueOf("8B8265"))
    }

    companion object {
        var rawCopper: Item? = null
        var rawLead: Item? = null
        var rawTitanium: Item? = null
        var granite: Item? = null
    }
}