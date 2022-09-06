<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <style>

.App {
  text-align: center;
}

.App-logo {
  height: 40vmin;
  pointer-events: none;
}

@media (prefers-reduced-motion: no-preference) {
  .App-logo {
    animation: App-logo-spin infinite 20s linear;
  }
}

.App-header {
  background-color: #282c34;
  min-height: 100vh;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  font-size: calc(10px + 2vmin);
  color: white;
}

.App-link {
  color: #61dafb;
}

@keyframes App-logo-spin {
  from {
    transform: rotate(0deg);
  }
  to {
    transform: rotate(360deg);
  }
}
.container{
 
  display: flex;
  flex: row;
justify-content: space-around;
}
.container1{
  
  width: 400px;
  height: 90vh;
  color: black;
  border: 3px solid pink;
  border-radius: 35px;
padding: 5px;
align-items: center;
  
  
}
.image{
  width:400px;
  height: 220px;
  border-top-left-radius: 35px;
  border-top-right-radius: 35px;
}

.bar{

  width: 400px;

}

.rolling{
  display: flex;
  flex: row;
justify-content: space-around;
}
.rolling1{
  display: flex;
  flex: row;
justify-content: space-around;
}

.box1{
  width: 35px;
  height: 35px;
  color: black;
  border: 3px solid black;
  border-radius: 75px;
padding: 5px;
align-items: center;
background-color: lightgray;
align-items: center;
}
.box2{
  width: 55px;
  height: 55px;
  color: black;
  border: 3px solid black;
  border-radius: 75px;
padding: 5px;
align-items: center;
background-color: rgb(79, 82, 80);
}
.box3{
  width: 45px;
  height: 45px;
  color: black;
  border: 3px solid black;
  border-radius: 75px;
padding: 5px;
align-items: center;
background-color: rgb(79, 82, 80);
}
.box4{
  width: 60px;
  height: 60px;
  color: black;
  border: 3px solid black;
  border-radius: 75px;
padding: 5px;
align-items: center;
background-color: #282c34;
align-items: center;
text-align: center;

}
.box5{
  width: 50px;
  height: 50px;
  color: black;
  border: 3px solid black;
  border-radius: 75px;
padding: 5px;
align-items: center;
background-color: rgb(79, 82, 80);
}
.table{
  padding: 5px;
}





    </style>
</head>
<body>

    <div className="container" style="display:flex ; flex:row; justify-content:space-between;">
     
        <div className="container1" style="width: 400px; height: 95vh; color:blcak;  border: 3px solid black; padding: 5px; align-items: center;">
         <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR3opWEU7pcXu6qSzS-bqTXZLLrnNyE806_zg&usqp=CAU" alt="logo" className='image'/>
         <h1>Rebecca</h1>
         <p>Capital America </p>
       <p>Age :      23</p>
       <p>Gender :      Male</p>
       <p>Occupation :     UI Developer</p>
       <p>Marital Status :     Single</p>
       <p>Location :     USA</p>
       <p>Online Location :      <span>Work from home</span></p>
       <p>computer :      <span>Windows11</span></p>
       <p>Internet Usage :      <span>9 hours</span></p>
   <div>
       <input class="bar" type="range"  />
       </div>
       <div>
       <input class="bar" type="range"  />
       </div>
       <div>
       <input class="bar" type="range"  />
       </div>
       
        </div>
        <div className="container1"  style="width: 900px; height: 90vh; color:blcak;  border: 3px solid black; padding: 5px; align-items: center;">
         
         <h3>Music is essential to Rebecca's life.
           She is listening to tunes almost every second of her life, particalarly while working
         </h3>
         <h4>Obstacies Rebecca faces:</h4>
         <p>.To busy to explain music artist she might like</p>
         <p>.Streaming music consumes a lot of data</p>
         <hr/>
         <h3>
           How will Rebecca interact with Spotify?
         </h3>
         <h5>Questions Rebecca will ask:</h5>
         <p>.How do i keep updated on new realesed by artists i follow? </p>
         <p>.How do i learn of new artists i haven't heard of?</p>
         <p>.Can i listen of music in a data-efficient manner?</p>
         <p>.How can i listen on both my MacBook and my iPhone?</p>
         <hr/>
         <h3>Who Influences Rebecca?</h3>
         <div className='rolling'>
        <div className='box1'>
         <p>Act</p>
        </div>
        <div className='box2'>
         <p>Friends</p>
        </div>
        <div className='box3'>
         <p>Music</p>
        </div>
        </div>
        <div className='rolling1'>
        <div className='box4'>
         <p>Her Own </p>
        </div>
        <div className='box5'>
         <p>Workers</p>
   </div>
        </div>
     
   
      </div>
      <div className="container1" style="width: 900px; height: 90vh; color:blcak;  border: 3px solid black; padding: 5px; align-items: center;" >
         
         <h3>Rebecca's Situation</h3>
         <h5>Goals, Motivation</h5>
         <p>. Listen to great music to keap her products at work</p>
         <p>. Relax and unwind at the end of the day</p>
         <p>. Surprise music quality for the enjoyment of tracks</p>
         <p>. Expand the circle of music artists she listen so</p>
         <h5>Key words</h5>
         <p>music ,jazz, r&b, pop ,artits , new Realsese, sop charts, background music</p>
     <hr/>
     <h2>Rebecca's Story</h2>
     <p>Rebecca is a 1938 Gothic novel written by English author Daphne du Maurier. The novel depicts an unnamed young woman who impetuously marries a wealthy widower, before discovering that both he and his household are haunted by the memory of his late first wife, the title character.</p>
   
      </div>
      
       </div>
    
</body>
</html>