import React, {Component} from 'react';
import Axios from 'axios';

class AllStats extends Component {
    constructor(){
        super();
        this.state = {match:""}
    }

    render(){
        return (
            <div className="container">
                <ol className="container">
                    <li>Char1</li>
                    <li>Char2</li>
                    <li>Char3</li>
                    <li>Char4</li>
                    <li>Char5</li>
                    <li>Char6</li>
                    <li>Char7</li>
                    <li>Char8</li>
                </ol>
            </div>
        );
    }
    
    componentDidMount(){
        Axios.get('http://localhost:8080/matches/allMatches')
        .then((response) => {
            console.log(response);
            })
            }
    
    
}

export default AllStats;