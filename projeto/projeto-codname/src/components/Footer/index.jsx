import './style.css'

export default function Footer(){
    return(
        <footer className='footer'>
           <p>
            &copy;{new Date().getFullYear()} - Todos os direitos reservador
            <br />
            SENAI - Bahia
            </p>


        </footer>
    )
}