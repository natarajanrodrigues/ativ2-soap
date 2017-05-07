//package ifpb.pos.ativ2.soap.client.main;
//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//import ifpb.pos.soap.cliente.Cliente;
//import ifpb.pos.soap.cliente.ClienteResources;
//import ifpb.pos.soap.cliente.ClienteResourcesService;
//import ifpb.pos.soap.empresa.Empresa;
//import ifpb.pos.soap.empresa.EmpresaResources;
//import ifpb.pos.soap.empresa.EmpresaResourcesService;
//import ifpb.pos.soap.hotel.Hotel;
//import ifpb.pos.soap.hotel.HotelResources;
//import ifpb.pos.soap.hotel.HotelResourcesService;
//import ifpb.pos.soap.pacote.Pacote;
//import ifpb.pos.soap.pacote.PacoteResources;
//import ifpb.pos.soap.pacote.PacoteResourcesService;
//import ifpb.pos.soap.reservahotel.ReservaHotel;
//import ifpb.pos.soap.reservahotel.ReservaHotelResources;
//import ifpb.pos.soap.reservahotel.ReservaHotelResourcesService;
//import ifpb.pos.soap.reservapassagem.ReservaPassagem;
//import ifpb.pos.soap.reservapassagem.ReservaPassagemResources;
//import ifpb.pos.soap.reservapassagem.ReservaPassagemResourcesService;
//
//import java.math.BigDecimal;
//
//
///**
// *
// * @author natarajan
// */
//public class Main {
//    
//    public static void main(String[] args) {
//        
//        //recurso de cliente
//        ClienteResourcesService clienteService = new ClienteResourcesService();
//        ClienteResources clienteResourcesPort = clienteService.getClienteResourcesPort();
//        
//        //criando e salvando cliente
//        Cliente cliente = new Cliente();
//        cliente.setNome("Natarajan");
//        cliente.setRenda(BigDecimal.valueOf(1000));
//        cliente.setCpf("00079089"); //cuidado para não tentar executar novamente com o mesmo cpf
//        Cliente addClient = clienteResourcesPort.addClient(cliente);
//        System.out.println("[Cliente criado com id: ]" + addClient.getId());
//        
//        //recurso de hotel
//        HotelResourcesService hotelService = new HotelResourcesService();
//        HotelResources hotelResourcesPort = hotelService.getHotelResourcesPort();
//        //criando e salvando hotel
//        Hotel hotel = new Hotel();
//        hotel.setNome("Village Palace Hotel");
//        Hotel hotelCriado = hotelResourcesPort.addHotel(hotel);
//        System.out.println("[Hotel criado com id: ]" + hotelCriado.getId());
//        
//        //recurso de reserva de hotel
//        ReservaHotelResourcesService reservaHotelService = new ReservaHotelResourcesService();
//        ReservaHotelResources reservaResourcesPort = reservaHotelService.getReservaHotelResourcesPort();
//        //criando e salvando a reserva de hotel
//        ReservaHotel reservaHotel = new ReservaHotel();
//        reservaHotel.setIdCliente(addClient.getId());
//        reservaHotel.setIdHotel(hotelCriado.getId());
//        ReservaHotel reservaHotelSalva = reservaResourcesPort.addReserva(reservaHotel);
//        System.out.println("[Criada reserva de hotel com id: ] " + reservaHotelSalva.getId());
//        
//        //recurso de empresa
//        EmpresaResourcesService empresaService = new EmpresaResourcesService();
//        EmpresaResources empresaResourcesPort = empresaService.getEmpresaResourcesPort();
//        //salvando empresa
//        Empresa empresa = new Empresa();
//        empresa.setNome("Guanabara");
//        Empresa empresaSalva = empresaResourcesPort.addEmpresa(empresa);
//        System.out.println("[Id da empresa salva]: " + empresaSalva.getId() 
//                + " - [nome da empresa]: " + empresaSalva.getNome());
//        
//        //recurso de reserva de passagem
//        ReservaPassagemResourcesService reservaService = new ReservaPassagemResourcesService();
//        ReservaPassagemResources reservaPassagemResourcesPort = reservaService.getReservaPassagemResourcesPort();
//        //criando e salvando a reserva de passagem
//        ReservaPassagem reservaPassagem = new ReservaPassagem();
//        reservaPassagem.setIdCliente(addClient.getId());
//        reservaPassagem.setIdEmpresa(empresaSalva.getId());
//        ReservaPassagem reservaSalva = reservaPassagemResourcesPort.addReservaPassagem(reservaPassagem);
//        System.out.println("[Criada reserva de passagem com id: ] " + reservaSalva.getId()
//                + " - [na empresa]: " + empresaSalva.getNome());
//        
//        
//        //criando e salvando pacote
//        PacoteResourcesService pacoteResourcesService = new PacoteResourcesService();
//        PacoteResources pacoteResourcesPort = pacoteResourcesService.getPacoteResourcesPort();
//        
//        System.out.println("[Criando pacote para o cliente já criado]");
//        Pacote pacoteParaClienteCriado = pacoteResourcesPort.criaPacote(addClient.getId());
//        System.out.println("[pacote criado com id: " + pacoteParaClienteCriado.getId() 
//                + " para o cliente com id: " + pacoteParaClienteCriado.getIdCliente() + " ]");
//                
//        System.out.println("[Adicionando Reserva Hotel - informando hotel já criado]");
//        Pacote pacoteAtualizadoReservaHotel = pacoteResourcesPort.addReservaHotelParaPacote(pacoteParaClienteCriado, hotelCriado.getId());
//        System.out.println("[adicionada reserva para o hotel com id: ]" + pacoteAtualizadoReservaHotel.getReservaHotel());
//        
//        System.out.println("\n");
//        
//        System.out.println("[Adicionando Reserva de Passagem - informando empresa já criada]");
//        Pacote pacoteAtualizado = pacoteResourcesPort.addReservaPassagemParaPacote(pacoteAtualizadoReservaHotel, empresaSalva.getId());
//        System.out.println("[adicionada reserva de passagem com id: ]" + pacoteAtualizado.getReservaPassagem());
//        
//    }
//    
//}
