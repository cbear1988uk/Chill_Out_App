import React, {Component} from 'react';
import Modal from 'react-modal';
class EmergencyKittens extends Component {
  constructor(props){
    super(props);
      this.state = {
        kitten: '',
        modalIsOpen: false
      };
      this.getKittens = this.getKittens.bind(this);
      this.openModal = this.openModal.bind(this);
      this.closeModal = this.closeModal.bind(this);
      this.openShowKitten = this.openShowKitten.bind(this);
  }

  getKittens(){
    const url = 'https://api.thecatapi.com/v1/images/search'
    fetch(url)
    .then(res => res.json())
    .then(data => this.setState({kitten: data[0].url}))
  }

  openModal() {
  this.setState({modalIsOpen: true});
  }

  closeModal() {
  this.setState({modalIsOpen: false});
  }

  openShowKitten(){
    this.openModal();
    this.getKittens();
  }

  render(){
    return(
      <React.Fragment>
      <div class="animated slideInRight duration-3s">
       <button className="button" onClick={this.openShowKitten}>Emergency Kittens!</button>
      </div>
      <Modal
       className="modal-box"
       isOpen={this.state.modalIsOpen}
       onRequestClose={this.closeModal}
       contentLabel="Example Modal"
       ariaHideApp={false}
       >
      <img id="kittens" src={this.state.kitten} alt=""></img>
       <button onClick={this.closeModal}>close</button>
      </Modal>
      </React.Fragment>
     )
  }
}

export default EmergencyKittens;
