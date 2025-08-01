import { useForm } from 'react-hook-form';

function CurrencyConvertor() {
  const { register, handleSubmit, reset } = useForm(); 

  function onSubmit(data) {
    console.log(data);
    if(data.currency.toString() !== 'Euro' && data.currency.toString() !== 'euro'  ) {
        if(data.currency.toString() === 'India' || data.currency.toString() === 'india' ){
        console.log(data);
        const amount = parseFloat(data.amount);
        const ruppee = (amount*90).toFixed(2);
        reset();
        alert("Converting to Rupees Amount is " +ruppee ); 
        }
        else{
            alert("Wrong Currency check once"); 
        }
    }
    else{
    const amount = parseFloat(data.amount);
    const euro = (amount / 90).toFixed(2);
    reset();
    alert("Converting to Euro Amount is " + euro); 
    }
  }

  return (
    <div style={{marginTop: '50px' }}>
      <h1 style={{ color: 'green' }}>Currency Convertor</h1>
      <form onSubmit={handleSubmit(onSubmit)}>
        <label htmlFor='amount'>Amount : </label>
        <input id='amount' type='number' {...register('amount')} />
        <br />
        <label htmlFor='currency'>Currency: </label>
        <input id='currency' type='text' {...register('currency')}/>
        <br /><br />
        <button type='submit'>Convert</button>
      </form>
    </div>
  );
}

export default CurrencyConvertor;
