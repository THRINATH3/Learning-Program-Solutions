import React from 'react'
import { IndianPlayers } from './IndianPlayers'
function IndianPlayersMerged() {
  return (
    <div>
        <h1>List of Indian Merged Players Merged:</h1>
        <ul>
            {IndianPlayers.map((player)=>(
                <li>Mr. {player} Player</li>
            ))}
        </ul>
    </div>
  )
}

export default IndianPlayersMerged