import React from "react";
import "./Header.css";

const Header = () => {
  function handleMenuClick(){
    console.log("Menu clicked.");
  }

  return (
    <div className="header">
      <div className="header-left">
        <img src="/qr.png" alt="Logo"/>
        <h2>QR Tool</h2>
      </div>
      <h2 onClick={handleMenuClick}>
        <i className="fa fa-bars" aria-hidden="true"></i>
      </h2>
    </div>
  );
};

export default Header;
