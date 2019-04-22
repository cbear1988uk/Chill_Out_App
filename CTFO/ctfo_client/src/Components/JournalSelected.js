import React from 'react';

const JournalSelected = ({entry}) => {
  if(!entry){
    return null
  }

  return(
    <div className="journal-selected">
      <p>{entry.comment}</p>
      <p>Mood at end of day: {entry.endMood}</p>
    </div>
  )

}

export default JournalSelected;
