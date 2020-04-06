import React from 'react';
import winner from '../../IMG/winner.png'
import playing from '../../IMG/playingAs.png'
import loser from '../../IMG/loser.png'
import versus from '../../IMG/vs.png'

var GameLogger = () => {
    return (
        <div className="container row align-items-center border rounded border-primary col-12">
            <form className="container col-5 text-center">
                <div className="form-group">
                    <img alt='dice throne winner' src={winner} className='miniBanner'></img>
                    <input
                        type="player"
                        className="form-control"
                        id="PlayerName"
                        aria-describedby="player"
                        placeholder="Enter player name"/>
                </div>
                <img alt='playing as' src={playing} className='playing'></img>
                <div className="form-group text-center">
                    <select className="form-control" id="CharacterName">
                        <option value="one">Seraph</option>
                        <option value="two">Vampire</option>
                        <option value="three">Engineer</option>
                        <option value="four">Cursed Pirate</option>
                        <option value="five">Samurai</option>
                        <option value="three">Gunslinger</option>
                        <option value="four">Tactician</option>
                        <option value="five">Huntress</option>
                    </select>
                </div>
            </form>
            <div className='container col-2 text-center'>
                <img alt='versus' src={versus} className='versus justify-content-center'></img>
                <br></br>
                <br></br>
                <br></br>
                <button className='btn btn-primary'>Save</button>
            </div>
            <form className="container col-5 text-center">
                <div className="form-group">
                    <img alt='dice throne loser' src={loser} className='miniBanner'></img>
                    <input
                        type="player"
                        className="form-control"
                        id="PlayerName"
                        aria-describedby="player"
                        placeholder="Enter player name"/>
                </div>
                <img alt='playing as' src={playing} className='playing'></img>
                <div className="form-group text-center">
                    <select className="form-control" id="CharacterName">
                        <option value="one">Seraph</option>
                        <option value="two">Vampire</option>
                        <option value="three">Engineer</option>
                        <option value="four">Cursed Pirate</option>
                        <option value="five">Samurai</option>
                        <option value="three">Gunslinger</option>
                        <option value="four">Tactician</option>
                        <option value="five">Huntress</option>
                    </select>
                </div>
            </form>
        </div>
    )
}
export default GameLogger;