const registerForm = document.getElementById('register')
const registerUsername = document.getElementById('register-username')
const registerPassword = document.getElementById('register-password')


const headers2 = {
    'Content-Type':'application/json'
}
const baseUrl2 = 'http://localhost:8080/api/v1/users'

const handleSubmit2 = async (e) =>{
    e.preventDefault()

    let bodyObj2 = {
        username: registerUsername.value,
        password: registerPassword.value
    }

    const response = await fetch(`${baseUrl}/register`, {
        method: "POST",
        body: JSON.stringify(bodyObj2),
        headers: headers
    })
        .catch(err => console.error(err.message))

    const responseArr = await response.json()

    if (response.status === 200){
        window.location.replace(responseArr[0])
    }
}

registerForm.addEventListener("submit", handleSubmit2)


