<%@ taglib uri="/struts-tags" prefix="s" %>
<div id="inscriptionBloc">
	<div id ="formInscr">
		<div style="padding: 10px 0px; background: #c5c5c5;">
		<img src="<%= request.getContextPath()%>/images/is.png" style="width: 77px; height: 77px;" >
		<p>Toutes vos annonces et vos favoris � un seul endroit, c'est gratuit</p>
		</div>
		
		<s:form style="padding: 10px 20px;" action="singUp" method="POST" enctype="multipart/form-data">
			<s:textfield name="u.nom" label="Nom" cssClass="field" style="width: 200px;" placeholder="Votre nom"/>
			<s:textfield name="u.prenom" label="Prenom" cssClass="field" style="width: 200px;" placeholder="Votre prenom"/>
			<s:textfield name="u.telephone" label="T�l�phone" cssClass="field" style="width: 220px;" placeholder="06XXXXXXXX"/>
			<s:textfield name="u.mail" label="E-mail" cssClass="field" placeholder="Exemple@gmail.com"/>
			<s:textfield label="V�rifiez e-mail" cssClass="field" placeholder="Exemple@gmail.com"/>
			<s:password name="u.motDePasse" label="Mot de passe" cssClass="field" placeholder="********"/>
			<s:password name="u.motDePasse" label="Confirmer le mot de passe" cssClass="field" placeholder="********"/>
			<s:select label="Ville" name="u.ville" value="%{'Casablanca'}" list="%{#{'Casablanca':'Casablanca'}}">
 				<s:optgroup label="-- VILLES --" list="%{#{'Casablanca':'Casablanca','Agadir':'Agadir','Al Hoc�ema':'Al Hoc�ema','B�ni Mellal':'B�ni Mellal','El Jadida':'El Jadida','Errachidia':'Errachidia','F�s':'F�s','K�nitra':'K�nitra','Khenifra':'Khenifra','Khouribga':'Khouribga','Larache':'Larache','Marrakech':'Marrakech','Meknas':'Meknas','Nador':'Nador','Ouarzazate':'Ouarzazate','Oujda':'Oujda','Rabat':'Rabat','Safi':'Safi','Settat':'Settat','Sal�':'Sal�','Tanger':'Tanger','Taza':'Taza','T�touan':'T�touan'}}" />
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
			<s:submit value="Cr��z un compte ! " cssClass="buttonGeneral"/>
		</s:form>
      	<div id="confidentialite">
	      	En cliquant sur "Cr�er un compte" j'accepte <a href="#">la Politique <br /> 
	      	de confidentialit�</a> de Moroccan-cakes.ma
      	</div>
	</div>
</div>