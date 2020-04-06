import React from 'react';
import {Switch, Redirect, Route} from 'react-router';
import {BrowserRouter, Link} from 'react-router-dom';

var Navigation = (props) => {
    return (
        <div className="container text-center">
            <div>
                <Link to='/'>Home</Link>
                |&nbsp;
                <Link to='/Character'>By character</Link>
                |&nbsp;
                <Link to='/Players'>Players</Link>
            </div>
            {props.children}
        </div>
    );
    
}

export default Navigation;