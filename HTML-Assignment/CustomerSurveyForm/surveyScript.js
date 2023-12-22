function submitForm() {
    const firstName = document.getElementById('firstName').value;
    const lastName = document.getElementById('lastName').value;
    const dob = document.getElementById('dob').value;
    const country = document.getElementById('country').value;
    const gender = document.getElementById('gender').value;
    const profession = document.getElementById('profession').value;
    const email = document.getElementById('email').value;
    const mobile = document.getElementById('mobile').value;
  
    if (validateForm(firstName, lastName, dob, profession, email, mobile)) {
      const popupMsg = `First Name: ${firstName}\nLast Name: ${lastName}\n
              Date of Birth: ${dob}\nCountry: ${country}\nGender: ${gender}\n
              Profession: ${profession}\nEmail id: ${email}\nContact Number: ${mobile}`;
  
      alert(popupMsg);
      resetForm();
    }
  }
  
  function resetForm() {
    document.getElementById('surveyForm').reset();
  }
  
  function validateForm(firstName, lastName, dob, profession, email, mobile) {
    if (!firstName.trim() || !lastName.trim() || !dob || !profession.trim() || !email.trim() || !mobile.trim()) {
      alert('Please fill in all required fields.');
      return false;
    }
  
    return true;
  }
  