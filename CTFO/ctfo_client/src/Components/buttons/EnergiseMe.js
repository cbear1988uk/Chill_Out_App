import React, {Component} from 'react';

import VideoPlayer from '../videoPlayer.js'

class EnergiseMe extends Component {
  constructor(props){
    super(props);
      this.state = {
        videos: null,
        modalIsOpen: false
      };
      this.getEnergy = this.getEnergy.bind(this);
      this.closeModal = this.closeModal.bind(this);
      this.openShowEnergy = this.openShowEnergy.bind(this);
      this.openModal = this.openModal.bind(this);
  }

  getEnergy(){
    const url = '/api/moods/8'
    fetch(url)
    .then(res => res.json())
    .then(data => this.setState({videos: data._embedded.videos}))
  }

  openModal() {
  this.setState({modalIsOpen: true});
  }

  closeModal() {
  this.setState({modalIsOpen: false});
  }

  openShowEnergy(){
    this.openModal();
    this.getEnergy();
  }

  render(){
    return(
      <React.Fragment>
        <div class="animated slideInRight duration-3s">
          <button className="button" onClick={this.openShowEnergy}>Energise Me!</button>
        </div>
        <VideoPlayer videos={this.state.videos} closeModal={this.closeModal} status={this.state.modalIsOpen}/>
      </React.Fragment>
     )
  }
}

export default EnergiseMe;
