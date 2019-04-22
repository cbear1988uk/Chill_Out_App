import React, { Component } from 'react';
import MainContainer from './containers/MainContainer'
import './App.css';
import './Components/styles/HomePage.css';
import './Components/styles/buttons.css'
import './Components/styles/moodJournal.css'


class App extends Component {

  render() {
    return (
      <div className="App">
        <MainContainer />
      </div>
    );
  }
}

export default App;
