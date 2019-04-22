import React, {Component} from 'react';
import QuoteMe from '../Components/buttons/QuoteMe';
import EmergencyKittens from '../Components/buttons/EmergencyKittens';
import ZenMe from '../Components/buttons/ZenMe';
import AdviseMe from '../Components/buttons/AdviseMe';
import RageMe from '../Components/buttons/RageMe';
import EnergiseMe from '../Components/buttons/EnergiseMe';

class PressMeContainer extends Component {
  render(){
    return (
    <React.Fragment>
    <div id="button-container">
    <QuoteMe />
    <EmergencyKittens />
    <AdviseMe />
    <ZenMe />
    <RageMe />
    <EnergiseMe />
    </div>
    </React.Fragment>
   )
  }
}


export default PressMeContainer;
