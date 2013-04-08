//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v@@BUILD_VERSION@@ 
// 	See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 	Any modifications to this file will be lost upon recompilation of the source schema. 
// 	Generated on: 2011.07.04 en 12:38:50 CEST 
//


package org.notariado.ancert.xml.plusvalias.liquidacion;


/**
 * Mensaje de intercambio sincrono que permite el pago de una liquidaci�n.
 * Java content class for PAGO_LIQUIDACION element declaration.
 * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/C:/Sun/jwsdp-1.5/jaxb/bin/IIVTNU-WS-Ayto.xsd line 303)
 * <p>
 * <pre>
 * &lt;element name="PAGO_LIQUIDACION">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;choice>
 *             &lt;element name="REQUEST">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence>
 *                       &lt;element name="CABECERA" type="{http://ancert.notariado.org/XML/Plusvalias/Liquidacion}CabeceraType"/>
 *                       &lt;element name="NOTARIO_TITULAR" type="{http://ancert.notariado.org/XML/Plusvalias/Liquidacion}NotarioType"/>
 *                       &lt;element name="NOTARIO_AUTORIZANTE" type="{http://ancert.notariado.org/XML/Plusvalias/Liquidacion}NotarioType"/>
 *                       &lt;element name="PROTOCOLO" type="{http://ancert.notariado.org/XML/Plusvalias/Liquidacion}ProtocoloType"/>
 *                       &lt;element name="ACTO_JURIDICO" type="{http://ancert.notariado.org/XML/Plusvalias/Liquidacion}ActoJuridicoType"/>
 *                       &lt;element name="TRANSMITENTES">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="TRANSMITENTE" type="{http://ancert.notariado.org/XML/Plusvalias/Liquidacion}TransmitenteType" maxOccurs="unbounded"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="ADQUIRENTES">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="ADQUIRENTE" type="{http://ancert.notariado.org/XML/Plusvalias/Liquidacion}AdquirenteType" maxOccurs="unbounded"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="INMUEBLE">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="REFERENCIA_CATASTRAL" type="{http://ancert.notariado.org/XML/Plusvalias/Liquidacion}REFERENCIA_CATASTRALType"/>
 *                                 &lt;element name="DIRECCION">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;sequence>
 *                                           &lt;element name="INE_PROVINCIA" type="{http://ancert.notariado.org/XML/Plusvalias/Liquidacion}CODIGO_PROVINCIAType"/>
 *                                           &lt;element name="INE_MUNICIPIO" type="{http://ancert.notariado.org/XML/Plusvalias/Liquidacion}CODIGO_MUNICIPIOType"/>
 *                                         &lt;/sequence>
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="REPRESENTANTES" minOccurs="0">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="REPRESENTANTE" type="{http://ancert.notariado.org/XML/Plusvalias/Liquidacion}SujetoType" maxOccurs="unbounded"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="PAGO">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="ORDEN_PAGO" type="{http://ancert.notariado.org/XML/Plusvalias/Liquidacion}ORDEN_PAGOType"/>
 *                                 &lt;element name="NRC" minOccurs="0">
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;length value="22"/>
 *                                   &lt;/restriction>
 *                                 &lt;/element>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="ESCRITURA">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="DIGEST" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                 &lt;element name="NOMBRE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                 &lt;element name="TAMANO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                 &lt;element name="MIME_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                     &lt;/sequence>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;element name="REPLY">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence>
 *                       &lt;element name="CABECERA" type="{http://ancert.notariado.org/XML/Plusvalias/Liquidacion}CabeceraType"/>
 *                       &lt;sequence minOccurs="0">
 *                         &lt;element name="NOTARIO_TITULAR" type="{http://ancert.notariado.org/XML/Plusvalias/Liquidacion}NotarioType"/>
 *                         &lt;element name="NOTARIO_AUTORIZANTE" type="{http://ancert.notariado.org/XML/Plusvalias/Liquidacion}NotarioType"/>
 *                         &lt;element name="PROTOCOLO" type="{http://ancert.notariado.org/XML/Plusvalias/Liquidacion}ProtocoloType"/>
 *                         &lt;element name="ACTO_JURIDICO" type="{http://ancert.notariado.org/XML/Plusvalias/Liquidacion}ActoJuridicoType"/>
 *                         &lt;element name="TRANSMITENTES">
 *                           &lt;complexType>
 *                             &lt;complexContent>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                 &lt;sequence>
 *                                   &lt;element name="TRANSMITENTE" type="{http://ancert.notariado.org/XML/Plusvalias/Liquidacion}TransmitenteType" maxOccurs="unbounded"/>
 *                                 &lt;/sequence>
 *                               &lt;/restriction>
 *                             &lt;/complexContent>
 *                           &lt;/complexType>
 *                         &lt;/element>
 *                         &lt;element name="ADQUIRENTES">
 *                           &lt;complexType>
 *                             &lt;complexContent>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                 &lt;sequence>
 *                                   &lt;element name="ADQUIRENTE" type="{http://ancert.notariado.org/XML/Plusvalias/Liquidacion}AdquirenteType" maxOccurs="unbounded"/>
 *                                 &lt;/sequence>
 *                               &lt;/restriction>
 *                             &lt;/complexContent>
 *                           &lt;/complexType>
 *                         &lt;/element>
 *                         &lt;element name="INMUEBLE">
 *                           &lt;complexType>
 *                             &lt;complexContent>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                 &lt;sequence>
 *                                   &lt;element name="REFERENCIA_CATASTRAL" type="{http://ancert.notariado.org/XML/Plusvalias/Liquidacion}REFERENCIA_CATASTRALType"/>
 *                                   &lt;element name="DIRECCION" type="{http://ancert.notariado.org/XML/Plusvalias/Liquidacion}DireccionInmuebleType"/>
 *                                   &lt;element name="SUPERFICIE_INMUEBLE" type="{http://ancert.notariado.org/XML/Plusvalias/Liquidacion}SUPERFICIE_INMUEBLEType" minOccurs="0"/>
 *                                 &lt;/sequence>
 *                               &lt;/restriction>
 *                             &lt;/complexContent>
 *                           &lt;/complexType>
 *                         &lt;/element>
 *                         &lt;element name="REPRESENTANTES" minOccurs="0">
 *                           &lt;complexType>
 *                             &lt;complexContent>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                 &lt;sequence>
 *                                   &lt;element name="REPRESENTANTE" type="{http://ancert.notariado.org/XML/Plusvalias/Liquidacion}SujetoType" maxOccurs="unbounded"/>
 *                                 &lt;/sequence>
 *                               &lt;/restriction>
 *                             &lt;/complexContent>
 *                           &lt;/complexType>
 *                         &lt;/element>
 *                         &lt;element name="IMPORTE_TOTAL" type="{http://ancert.notariado.org/XML/Plusvalias/Liquidacion}IMPORTE_ECONOMICOType"/>
 *                         &lt;element name="DOCUMENTOS">
 *                           &lt;complexType>
 *                             &lt;complexContent>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                 &lt;sequence>
 *                                   &lt;element name="DOCUMENTO" maxOccurs="unbounded">
 *                                     &lt;complexType>
 *                                       &lt;complexContent>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                           &lt;sequence>
 *                                             &lt;element name="ID_SUJETO" type="{http://ancert.notariado.org/XML/Plusvalias/Liquidacion}ID_SECUENCIALType"/>
 *                                             &lt;element name="IMPORTE">
 *                                               &lt;complexType>
 *                                                 &lt;complexContent>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                     &lt;sequence>
 *                                                       &lt;element name="INFORMA_RECARGO" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                                       &lt;element name="PORCENTAJE_RECARGO" type="{http://ancert.notariado.org/XML/Plusvalias/Liquidacion}PORCENTAJEType" minOccurs="0"/>
 *                                                       &lt;element name="IMPORTE_RECARGO" type="{http://ancert.notariado.org/XML/Plusvalias/Liquidacion}IMPORTE_ECONOMICOType" minOccurs="0"/>
 *                                                       &lt;element name="IMPORTE_TOTAL" type="{http://ancert.notariado.org/XML/Plusvalias/Liquidacion}IMPORTE_ECONOMICOType"/>
 *                                                     &lt;/sequence>
 *                                                   &lt;/restriction>
 *                                                 &lt;/complexContent>
 *                                               &lt;/complexType>
 *                                             &lt;/element>
 *                                             &lt;element name="PDF">
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
 *                                                 &lt;minLength value="1"/>
 *                                               &lt;/restriction>
 *                                             &lt;/element>
 *                                             &lt;element name="CODIGO_JUSTIFICANTE_PAGO" minOccurs="0">
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                 &lt;pattern value="\d{12}"/>
 *                                               &lt;/restriction>
 *                                             &lt;/element>
 *                                           &lt;/sequence>
 *                                         &lt;/restriction>
 *                                       &lt;/complexContent>
 *                                     &lt;/complexType>
 *                                   &lt;/element>
 *                                 &lt;/sequence>
 *                               &lt;/restriction>
 *                             &lt;/complexContent>
 *                           &lt;/complexType>
 *                         &lt;/element>
 *                       &lt;/sequence>
 *                       &lt;element name="RESULTADO">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="RETORNO" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                 &lt;element name="ERROR" minOccurs="0">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;sequence>
 *                                           &lt;element name="CODIGO">
 *                                             &lt;restriction base="{http://ancert.notariado.org/XML/Plusvalias/Liquidacion}STRINGType">
 *                                               &lt;length value="4"/>
 *                                             &lt;/restriction>
 *                                           &lt;/element>
 *                                           &lt;element name="DESCRIPCION">
 *                                             &lt;restriction base="{http://ancert.notariado.org/XML/Plusvalias/Liquidacion}STRINGType">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="255"/>
 *                                             &lt;/restriction>
 *                                           &lt;/element>
 *                                         &lt;/sequence>
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                     &lt;/sequence>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *           &lt;/choice>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 */
public interface PAGOLIQUIDACION
    extends javax.xml.bind.Element, org.notariado.ancert.xml.plusvalias.liquidacion.PAGOLIQUIDACIONType
{


}