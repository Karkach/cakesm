<%@ taglib uri="/struts-tags" prefix="s" %>
<div id="inscriptionBloc">
	<div id ="formInscr">
		<div style="padding: 10px 0px; background: #c5c5c5;">
		<img src="<%= request.getContextPath()%>/images/Cake-icon.png" style="width: 77px; height: 77px;" >
		<p>Toutes vos annonces et vos favoris à un seul endroit, c'est gratuit</p>
		</div>
		
		<s:form style="padding: 10px 20px;" action="addAnnonce" namespace="/account/annonce" method="POST" enctype="multipart/form-data">
			<s:textfield name="annonce.titre" label="Titre" cssClass="field"  placeholder="Titre de l'annonce"/>
			<s:textarea name="annonce.text" label="Description" style="height: 150px; width: 320px;" cssClass="field"  placeholder="Description"/>
			<s:if test="%{#session.user == null }">
				<s:select label="Ville" name="annonce.ville" value="%{'Casablanca'}" list="%{#{'Casablanca':'Casablanca'}}">
	 				<s:optgroup label="-- VILLES --" list="%{#{'Casablanca':'Casablanca','Agadir':'Agadir','Al Hocéema':'Al Hocéema','Béni Mellal':'Béni Mellal','El Jadida':'El Jadida','Errachidia':'Errachidia','Fès':'Fès','Kénitra':'Kénitra','Khenifra':'Khenifra','Khouribga':'Khouribga','Larache':'Larache','Marrakech':'Marrakech','Meknas':'Meknas','Nador':'Nador','Ouarzazate':'Ouarzazate','Oujda':'Oujda','Rabat':'Rabat','Safi':'Safi','Settat':'Settat','Salé':'Salé','Tanger':'Tanger','Taza':'Taza','Tétouan':'Tétouan'}}" />
				</s:select>
			</s:if>
			
			<s:select style="margin-top:10px;" label="Type" name="annonce.type" value="%{'Traditionnels'}" list="%{#{'Traditionnels':'Traditionnels'}}">
	 				<s:optgroup label="-- VILLES --" list="%{#{'Gâteau Chanteclair':'Gâteau Chanteclair','Gâteau au chocolat':'Gâteau au chocolat','Gâteau au yaourt':'Gâteau au yaourt','Gâteau basque':'Gâteau basque','Gâteau de Battenberg':'Gâteau de Battenberg','Gâteau battu':'Gâteau battu','Gâteau au fromage':'Gâteau au fromage','Brownie aux noix':'Brownie aux noix','Cake':'Cake','Biscuit de Savoie':'Biscuit de Savoie','Cannelé':'Cannelé','Génoise':'Génoise','Madeleine':'Madeleine'}}" />
			</s:select>
			<tr>
	    		<td class="tdLabel">
	    			<label class="label">Ajouter une image : </label>
	    		</td>
	    		<td>
	    			<img src="<%= request.getContextPath()%>/images/image-icone.png" 
	    				 onclick="document.getElementById('fileUpload').click();"
	    				 style="width: 120px; margin: 10px 0px 0px 80px;"
	    				 class="fileUpload"/>
	    		</td>
			</tr>
			<s:file name="imageFile" id="fileUpload" style="visibility: hidden" />
			<s:submit value="Ajouter ! " cssClass="buttonGeneral"/>
		</s:form>
      	<div id="confidentialite" >
	      	Toutes vos annonces et vos favoris à un seul endroit, c'est gratuit
      	</div>
	</div>
</div>