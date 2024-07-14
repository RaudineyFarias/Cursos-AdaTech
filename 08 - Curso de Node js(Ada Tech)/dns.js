const { SocketAddress } = require('net');
const dns = require('node: dns');

const urlPesquisada =  'google.com'

const ipv4 = dns.resolve4(searchedUrl, (err, adreesses) => {
    if (err){
        console.log('url Não encontrada')
        return
    }
    console.log(addresses)
})


async function bootstrap(){
    const addresses = await  dns.promises.resolve4(searchedUrl)

    console.log(addresses)
}
bootstrap()