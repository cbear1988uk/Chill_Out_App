import React, { Component } from "react";
import Home from "../Components/Home";
import Request from "../helpers/request";

class HomeContainer extends Component {
  constructor(props){
    super(props);
    this.state = {
      moods: [],
      images: [],
      quotes: [],
      videos: []
    };
     this.handleCommentPost = this.handleCommentPost.bind(this);
  }

  handleCommentPost(comment){
   const request = new Request();
   request.post('/api/journals', comment).then(() => {
     window.location = '/journals'
   })
 }

componentDidMount(){
  const request = new Request()
  const moodPromise = request.get('/api/moods');
  const imagesPromise = request.get('/api/images');
  const quotesPromise = request.get('/api/quotes');
  const videosPromise = request.get('/api/videos');
  const promises = [moodPromise, imagesPromise, quotesPromise, videosPromise];

  Promise.all(promises)
  .then(data => {
    this.setState({
      moods: data[0]._embedded.moods,
      images: data[1]._embedded.images,
      quotes: data[2]._embedded.quotes,
      videos: data[3]._embedded.videos,
    })
  })
}

  render(){
    return(
      <React.Fragment>
       <Home moods={this.state.moods}></Home>
      </React.Fragment>
    )
  }
}

export default HomeContainer;
