<%@ taglib uri="/struts-tags" prefix="s" %>
<div id="inscriptionBloc">
	<div id ="formInscr">
		<div style="padding: 10px 0px; background: #c5c5c5;">
		<img src="<%= request.getContextPath()%>/images/user-edit-icon.png" style="width: 77px; height: 77px;" >
		<p>Modifier votre profile </p>
		</div>
		
		<s:form style="padding: 10px 20px;" action="editProfile" naenctype="multipart/form-data" method="post">
			<s:textfield name="u.nom" value="%{#session.user.nom}" label="Nom" cssClass="field" style="width: 200px;" placeholder="Votre nom"/>
			<s:textfield name="u.prenom" value="%{#session.user.prenom}" label="Prenom" cssClass="field" style="width: 200px;" placeholder="Votre prenom"/>
			<s:textfield name="u.telephone" value="%{#session.user.telephone}" label="Téléphone" cssClass="field" style="width: 220px;" placeholder="06XXXXXXXX"/>
			<s:textfield name="u.mail" label="E-mail" value="%{#session.user.mail}" cssClass="field" placeholder="Exemple@gmail.com"/>
			<s:password name="u.motDePasse" value="%{#session.user.moyDePasse}" label="Mot de passe" cssClass="field" placeholder="********"/>
			<s:select label="Ville" name="u.ville" value="%{#session.user.ville}" list="%{#{#session.user.ville:#session.user.ville}}">
 				<s:optgroup label="-- VILLES --" list="%{#{'Casablanca':'Casablanca','Agadir':'Agadir','Al Hocéema':'Al Hocéema','Béni Mellal':'Béni Mellal','El Jadida':'El Jadida','Errachidia':'Errachidia','Fès':'Fès','Kénitra':'Kénitra','Khenifra':'Khenifra','Khouribga':'Khouribga','Larache':'Larache','Marrakech':'Marrakech','Meknas':'Meknas','Nador':'Nador','Ouarzazate':'Ouarzazate','Oujda':'Oujda','Rabat':'Rabat','Safi':'Safi','Settat':'Settat','Salé':'Salé','Tanger':'Tanger','Taza':'Taza','Tétouan':'Tétouan'}}" />
			</s:select>
			<tr>
				<td class="tdLabel"><label class="label">Modifier Votre photo :</label></td>
				<td>
				<img src="<%= request.getContextPath()%>/images/avatar_icone.png" 
					title="Select a File to upload" 
					id="ic_add" 
					onclick="document.getElementById('fileUpload').click();"/>
				</td>
			</tr>
			<s:file name="avatar" id="fileUpload" style="visibility: hidden"/>
			<s:submit value="Modifier ! " cssClass="buttonGeneral"/>
		</s:form>
      	<div id="confidentialite">
	      	En cliquant sur <span style="text-decoration: underline; color : #2c4828;">"Modifier"</span> pour modéfier votre profile
      	</div>
	</div>
</div>