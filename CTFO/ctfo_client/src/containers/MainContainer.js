import React, { Component } from "react";
import NavBar from "../Components/navBar";
import HomeContainer from "./HomeContainer";
// import PressMe from "../Components/PressMe";
import MoodJournal from "../Components/MoodJournal";
import Map from "../Components/Map";
import PressMeContainer from "../containers/PressMeContainer";
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
class MainContainer extends Component {

 render() {
 return (
   <Router>
     <React.Fragment>
       <NavBar />
       <Switch>
       <Route exact path="/" component={HomeContainer} />
       <Route exact path="/pressMe" component={PressMeContainer} />
       <Route exact path="/parkfinder" component={Map} />
       <Route exact path="/moodjournal" component={MoodJournal} />
       </Switch>
     </React.Fragment>
   </Router>
 );
}
}

export default MainContainer;
