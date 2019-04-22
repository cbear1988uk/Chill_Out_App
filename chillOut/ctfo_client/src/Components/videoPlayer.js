import React, {Component} from 'react';
import Modal from 'react-modal';

class VideoPlayer extends Component {
  constructor(props){
    super(props);
    // this.state = {
    //   modalIsOpen: true
    // };
    this.closeModal = this.closeModal.bind(this);
    this.randomNum = this.randomNum.bind(this);
    this.openModal = this.openModal.bind(this);
  }

  openModal() {
  this.setState({modalIsOpen: true});
  }

  closeModal() {
      this.props.closeModal();
  this.setState({modalIsOpen: false});

  }

  randomNum(length){
    return Math.floor(Math.random()*length)
  }

  render(){
    if(!this.props.videos){
      return null;
    }
    return(
      <Modal
       className="modal-box"
       isOpen={this.props.status}
       onRequestClose={this.closeModal}
       contentLabel="Example Modal"
       ariaHideApp={false}>
       <div className="video-wrapper">
          <iframe className="you-tube" title="button-video" src={this.props.videos[this.randomNum(this.props.videos.length)].videoUrl} frameBorder="0" allowFullScreen></iframe>
       </div>
       <button className="close-modal-window" onClick={this.closeModal}>close</button>
      </Modal>
    )
  }
}

export default VideoPlayer;
