<%@ taglib uri="/struts-tags" prefix="s" %>
<div id="inscriptionBloc">
	<div id ="formInscr">
		<div style="padding: 10px 0px; background: #c5c5c5;">
		<img src="<%= request.getContextPath()%>/images/is.png" style="width: 77px; height: 77px;" >
		<p>Toutes vos annonces et vos favoris à un seul endroit, c'est gratuit</p>
		</div>
		
		<s:form style="padding: 10px 20px;" action="singUp" method="POST" enctype="multipart/form-data">
			<s:textfield name="u.nom" label="Nom" cssClass="field" style="width: 200px;" placeholder="Votre nom"/>
			<s:textfield name="u.prenom" label="Prenom" cssClass="field" style="width: 200px;" placeholder="Votre prenom"/>
			<s:textfield name="u.telephone" label="Téléphone" cssClass="field" style="width: 220px;" placeholder="06XXXXXXXX"/>
			<s:textfield name="u.mail" label="E-mail" cssClass="field" placeholder="Exemple@gmail.com"/>
			<s:textfield label="Vérifiez e-mail" cssClass="field" placeholder="Exemple@gmail.com"/>
			<s:password name="u.motDePasse" label="Mot de passe" cssClass="field" placeholder="********"/>
			<s:password name="u.motDePasse" label="Confirmer le mot de passe" cssClass="field" placeholder="********"/>
			<s:select label="Ville" name="u.ville" value="%{'Casablanca'}" list="%{#{'Casablanca':'Casablanca'}}">
 				<s:optgroup label="-- VILLES --" list="%{#{'Casablanca':'Casablanca','Agadir':'Agadir','Al Hocéema':'Al Hocéema','Béni Mellal':'Béni Mellal','El Jadida':'El Jadida','Errachidia':'Errachidia','Fès':'Fès','Kénitra':'Kénitra','Khenifra':'Khenifra','Khouribga':'Khouribga','Larache':'Larache','Marrakech':'Marrakech','Meknas':'Meknas','Nador':'Nador','Ouarzazate':'Ouarzazate','Oujda':'Oujda','Rabat':'Rabat','Safi':'Safi','Settat':'Settat','Salé':'Salé','Tanger':'Tanger','Taza':'Taza','Tétouan':'Tétouan'}}" />
			</s:select>
			
			<tr>
	    		<td class="tdLabel">
	    			<label class="label">Ajouter une image : </label>
	    		</td>
	    		<td>
	    			<img src="<%= request.getContextPath()%>/images/avatar_icone.png" 
	    				 onclick="document.getElementById('fileUpload').click();"
	    				 style="width: 120px; margin: 10px 0px 0px 80px;"
	    				 class="fileUpload"/>
	    		</td>
			</tr>
			<s:file name="avatar" id="fileUpload" style="visibility: hidden" />
			<s:submit value="Crééz un compte ! " cssClass="buttonGeneral"/>
		</s:form>
      	<div id="confidentialite">
	      	En cliquant sur "Créer un compte" j'accepte <a href="#">la Politique <br /> 
	      	de confidentialité</a> de Moroccan-cakes.ma
      	</div>
	</div>
</div>