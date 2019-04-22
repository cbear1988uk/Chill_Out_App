import React from "react";
import { Link } from "react-router-dom";
import './styles/navBar.css';

const NavBar = () => (
  <div id="navBar">
    <ul>
      <li>
        <Link to="/">Home</Link>
      </li>
      <li>
        <Link to="/pressMe">Press Me</Link>
      </li>
      <li>
        <Link to="/moodjournal">Mood Journal</Link>
      </li>
      <li>
        <Link to="/parkfinder">Park Finder</Link>
      </li>
    </ul>
  </div>
)

export default NavBar;
