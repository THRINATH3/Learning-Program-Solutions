import React from 'react'
import './CaluculateScore.css';

function CaluculateScore(props) {


  function calSore(total,goal){
    let ans = total/goal;
    return ans.toFixed(2)+"%";
  }
  
  return (
    <div className='container'>
        <h1>Student Details:</h1>
        <div className='name'>
            <b>Name: </b> <span>{props.name}</span>
        </div>
        <div className='school'>
            <b>School: </b> <span>{props.school}</span>
        </div>
        <div className='total'>
            <b>Total: </b> <span>{props.total} Marks</span>
        </div>
        <div className='score'>
            <b>Score: </b> <span>{calSore(props.total,props.goal)}</span>
        </div>
    </div>
  )
}

export default CaluculateScore