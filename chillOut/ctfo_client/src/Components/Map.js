import React from 'react';
import ReactMapboxGl from "react-mapbox-gl";
import './styles/map.css';


const Map = () => {

  const Map = ReactMapboxGl({
    accessToken: "pk.eyJ1Ijoicm9kZ2VyLXRoZS1zaHJ1YmJlciIsImEiOiJjanNqZ3gxNnoyYXFyNDN0YnV2dGVjeTl1In0.7YUhBJNDpqGmjW8iLzpgaQ"
  })

  return (
    <div id="map">
    <Map
    style="mapbox://styles/mapbox/streets-v8"
    center={[ -4.251433, 55.860916 ]}
    containerStyle={{
      height: "80vh",
      width: "72vh"
    }}>
    </Map>
    </div>
  )
}

export default Map;
