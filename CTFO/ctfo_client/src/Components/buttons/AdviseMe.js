import React, {Component} from 'react';
import Modal from 'react-modal';

class AdviseMe extends Component {
  constructor(props){
    super(props);
      this.state = {
        advice: '',
        modalIsOpen: false
      };
      this.getAdvice = this.getAdvice.bind(this);
      this.openModal = this.openModal.bind(this);
      this.closeModal = this.closeModal.bind(this);
      this.openShowAdvice = this.openShowAdvice.bind(this);
  }

  getAdvice(){
    const url = 'https://api.adviceslip.com/advice'
    fetch(url)
    .then(res => res.json())
    .then(data => this.setState({advice: data.slip.advice}))
  }

  openModal() {
  this.setState({modalIsOpen: true});
  }

  closeModal() {
  this.setState({modalIsOpen: false});
  }

  openShowAdvice(){
    this.openModal();
    this.getAdvice();
  }

  render(){
    return(
      <React.Fragment>
      <div class="animated slideInLeft duration-3s">
       <button className="button" onClick={this.openShowAdvice}>Advise Me!</button>
      </div>
      <Modal
       className="modal-box"
       isOpen={this.state.modalIsOpen}
       onRequestClose={this.closeModal}
       contentLabel="Example Modal"
       ariaHideApp={false}
       >
       <p>{this.state.advice}</p>
       <button onClick={this.closeModal}>close</button>
      </Modal>
      </React.Fragment>
     )
  }
}

export default AdviseMe;
