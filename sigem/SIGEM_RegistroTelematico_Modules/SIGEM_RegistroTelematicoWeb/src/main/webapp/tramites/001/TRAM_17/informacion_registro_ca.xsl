<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:import href="informacion_registro.xsl" />
<xsl:output encoding="ISO-8859-1" method="html"/>
	<xsl:variable name="lang.docIdentidad" select="'CAT-Documento de identidad'"/>
	<xsl:variable name="lang.nombre" select="'CAT-Nombre'"/>
	<xsl:variable name="lang.email" select="'CAT-Correo electr�nico'"/>
	<xsl:variable name="lang.numRegistro" select="'CAT-N�mero de registro'"/>
	<xsl:variable name="lang.fechaRegistro" select="'CAT-Fecha de registro'"/>
	<xsl:variable name="lang.asunto" select="'CAT-Asunto'"/>
</xsl:stylesheet>