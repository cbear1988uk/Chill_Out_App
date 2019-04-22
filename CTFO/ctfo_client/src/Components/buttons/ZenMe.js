import React, {Component} from 'react';

import VideoPlayer from '../videoPlayer';

class ZenMe extends Component {
  constructor(props){
    super(props);
      this.state = {
        videos: null,
        modalIsOpen: false
      };
      this.getZen = this.getZen.bind(this);
      this.openShowZen = this.openShowZen.bind(this);
      this.openModal = this.openModal.bind(this);
      this.closeModal = this.closeModal.bind(this);
  }

  getZen(){
    const url = '/api/moods/7'
    fetch(url)
    .then(res => res.json())
    .then(data => this.setState({videos: data._embedded.videos}))
  }

  openModal() {
    console.log("Open modal cslled from zenme");
  this.setState({modalIsOpen: true});
  }

  closeModal() {
    console.log("Closemodal called from zenme");
  this.setState({modalIsOpen: false});
  }

  openShowZen(){
    this.openModal();
    this.getZen();
  }

  render(){
    console.log(this.state.videos);
    return(
      <React.Fragment>
        <div class="animated slideInRight duration-3s">
          <button className="button" onClick={this.openShowZen}>Zen Me!</button>
        </div>
        <VideoPlayer videos={this.state.videos} closeModal={this.closeModal} status={this.state.modalIsOpen}/>
      </React.Fragment>
     )
  }
}

export default ZenMe;
