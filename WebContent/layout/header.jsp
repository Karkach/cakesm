<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<div id ="menu">
	<s:a action="index" namespace="/" id="index"></s:a>
	<s:if test="%{#session.user == null}">
		<ul>
			<li><a href="#">Aide!</a></li>
			<li><s:a action="ajouterAnnonce" namespace="/account/annonce">Déposer une annonce</s:a></li>
			<li><s:a action="inscription" namespace="/account"><span id="userPlus"></span>Créér coompte</s:a></li>
			<li><s:a action="seConnecter" namespace="/account"><span id="user"></span>Se connecter</s:a></li>
		</ul>
	</s:if>
	<s:else>
		<ul>
			<li><a href="#">Aide!</a></li>
			<li><s:a action="editProfile" namespace="/account">Profile</s:a></li>
			<li><s:a action="profile" namespace="/account">Mes annonces</s:a></li>
			<li><s:a action="ajouterAnnonce" namespace="/account/annonce">Déposer une annonce</s:a></li>
			<li><s:a action="logout" namespace="/account" >Déconnection</s:a></li>
		</ul>
	</s:else>
	<div id="search">
		<form action="">
			<input type="text" placeholder="Que Rechercher-Vous" />
			<s:select name="type" value="%{'Traditionnels'}" list="%{#{'Traditionnels':'Traditionnels'}}">
	 				<s:optgroup label="-- VILLES --" list="%{#{'Gâteau Chanteclair':'Gâteau Chanteclair','Gâteau au chocolat':'Gâteau au chocolat','Gâteau au yaourt':'Gâteau au yaourt','Gâteau basque':'Gâteau basque','Gâteau de Battenberg':'Gâteau de Battenberg','Gâteau battu':'Gâteau battu','Gâteau au fromage':'Gâteau au fromage','Brownie aux noix':'Brownie aux noix','Cake':'Cake','Biscuit de Savoie':'Biscuit de Savoie','Cannelé':'Cannelé','Génoise':'Génoise','Madeleine':'Madeleine'}}" />
			</s:select>
			<s:select name="ville" value="%{'Tout le Maroc'}" list="%{#{'all':'Tout le Maroc'}}">
 				<s:optgroup label="-- AUTRES VILLES --" list="%{#{'Casablanca':'Casablanca','Agadir':'Agadir','Al Hocéema':'Al Hocéema','Béni Mellal':'Béni Mellal','El Jadida':'El Jadida','Errachidia':'Errachidia','Fès':'Fès','Kénitra':'Kénitra','Khenifra':'Khenifra','Khouribga':'Khouribga','Larache':'Larache','Marrakech':'Marrakech','Meknas':'Meknas','Nador':'Nador','Ouarzazate':'Ouarzazate','Oujda':'Oujda','Rabat':'Rabat','Safi':'Safi','Settat':'Settat','Salé':'Salé','Tanger':'Tanger','Taza':'Taza','Tétouan':'Tétouan'}}" />
			</s:select>
			<input type="submit" value="Chercher"  class="buttonGeneral"/>
		</form>
	</div>
</div>