import React from 'react';
import CommentForm from "./CommentForm"

const MoodSelected = ({mood}) => {
  let index = null
  if (!mood){
    return null
  } else {
    index = randomNum(mood.quotes.length)
  }

  function randomNum(length){
    return Math.floor(Math.random()*length)
  }

  return(
    <div className="mood-selected">
      <p className="quote-text animation fadeIn">{mood.quotes[index].text}</p>
      <p className="quote-author animation fadeIn">-{mood.quotes[index].author}</p>
      <img className="yoga-image" src={mood.images[randomNum(mood.images.length)].imageUrl} alt=""></img>
      <div className="video-wrapper">
        <iframe className="inspire-video" title="mood-video" src={mood.videos[randomNum(mood.videos.length)].videoUrl} frameBorder="0" allowFullScreen></iframe>
      </div>
      <CommentForm />
    </div>
  )

}
export default MoodSelected;
