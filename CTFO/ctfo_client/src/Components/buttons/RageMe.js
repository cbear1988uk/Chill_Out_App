import React, {Component} from 'react';

import VideoPlayer from '../videoPlayer.js'

class RageMe extends Component {
  constructor(props){
    super(props);
    this.state = {
      videos: null,
      modalIsOpen: false
    };
    this.getRage = this.getRage.bind(this);
    this.closeModal = this.closeModal.bind(this);
    this.openShowRage = this.openShowRage.bind(this);
    this.openModal = this.openModal.bind(this);
  }

  getRage(){
    const url = 'api/moods/6'
    fetch(url)
    .then(res => res.json())
    .then(data => this.setState({videos: data._embedded.videos}))
  }

  openModal() {
  this.setState({modalIsOpen: true});
  }

  closeModal(){
    this.setState({modalIsOpen: false});
  }

  openShowRage(){
    this.openModal();
    this.getRage();
  }

  render(){
    return(
      <React.Fragment>
        <div class="animated slideInLeft duration-3s">
          <button className="button" onClick={this.openShowRage}>Rage Me!</button>
        </div>
        <VideoPlayer videos={this.state.videos} closeModal={this.closeModal} status={this.state.modalIsOpen}/>
      </React.Fragment>
    )
  }

}

export default RageMe;
