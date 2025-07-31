import React from 'react'
import playersList from './PlayersList'
import OddPlayers from './OddPlayers'
import EvenPlayers from './EvenPlayers'
import IndianPlayersMerged from './IndianPlayersMerged'
function Allplayers() {
  return (
    <div>
        <OddPlayers playersList={playersList}/>
        <EvenPlayers playersList={playersList} />
        <IndianPlayersMerged />
    </div>
  )
}

export default Allplayers