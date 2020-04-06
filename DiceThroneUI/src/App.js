import React from 'react';
import Banner from './Components/banner.js'
import './App.css';
import Navigation from './Components/Navigation/Navigation.js'
import Table from './Components/Table/AllStatistics.js'
import GameLog from './Components/GameLogger/GameLogger.js'
function App() {
  return (
    <div className="container col-8">
        <Banner/>
      <header className="container">
        <Navigation/> 
        <GameLog/>
      </header>
      <body>
        <br></br>
        <Table/>
      </body>
    </div>
  );
}

export default App;
