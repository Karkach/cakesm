<%@ taglib uri="/struts-tags" prefix="s" %>
<div id="inscriptionBloc">
	<s:if test="%{annonces.size() != 0}">
   		<h1 style="color: white;">you have anonnce</h1>
	</s:if>
	<s:else>
    	<h1 style="color: white; margin: 150px 0px 250px 0px;">
    		Actuellement vous avez aucun annones <br /> 
    		<s:a action="ajouterAnnonce" namespace="/account/annonce">Déposer une annonce</s:a>
    	</h1>
	</s:else>
</div>