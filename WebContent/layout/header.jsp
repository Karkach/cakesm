<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<div id ="menu">
	<s:a action="index" namespace="/" id="index"></s:a>
	<s:if test="%{#session.user == null}">
		<ul>
			<li><a href="#">Aide!</a></li>
			<li><s:a action="ajouterAnnonce" namespace="/account/annonce">D�poser une annonce</s:a></li>
			<li><s:a action="inscription" namespace="/account"><span id="userPlus"></span>Cr��r coompte</s:a></li>
			<li><s:a action="seConnecter" namespace="/account"><span id="user"></span>Se connecter</s:a></li>
		</ul>
	</s:if>
	<s:else>
		<ul>
			<li><a href="#">Aide!</a></li>
			<li><s:a action="editProfile" namespace="/account">Profile</s:a></li>
			<li><s:a action="profile" namespace="/account">Mes annonces</s:a></li>
			<li><s:a action="ajouterAnnonce" namespace="/account/annonce">D�poser une annonce</s:a></li>
			<li><s:a action="logout" namespace="/account" >D�connection</s:a></li>
		</ul>
	</s:else>
	<div id="search">
		<form action="">
			<input type="text" placeholder="Que Rechercher-Vous" />
			<s:select name="type" value="%{'Traditionnels'}" list="%{#{'Traditionnels':'Traditionnels'}}">
	 				<s:optgroup label="-- VILLES --" list="%{#{'G�teau Chanteclair':'G�teau Chanteclair','G�teau au chocolat':'G�teau au chocolat','G�teau au yaourt':'G�teau au yaourt','G�teau basque':'G�teau basque','G�teau de Battenberg':'G�teau de Battenberg','G�teau battu':'G�teau battu','G�teau au fromage':'G�teau au fromage','Brownie aux noix':'Brownie aux noix','Cake':'Cake','Biscuit de Savoie':'Biscuit de Savoie','Cannel�':'Cannel�','G�noise':'G�noise','Madeleine':'Madeleine'}}" />
			</s:select>
			<s:select name="ville" value="%{'Tout le Maroc'}" list="%{#{'all':'Tout le Maroc'}}">
 				<s:optgroup label="-- AUTRES VILLES --" list="%{#{'Casablanca':'Casablanca','Agadir':'Agadir','Al Hoc�ema':'Al Hoc�ema','B�ni Mellal':'B�ni Mellal','El Jadida':'El Jadida','Errachidia':'Errachidia','F�s':'F�s','K�nitra':'K�nitra','Khenifra':'Khenifra','Khouribga':'Khouribga','Larache':'Larache','Marrakech':'Marrakech','Meknas':'Meknas','Nador':'Nador','Ouarzazate':'Ouarzazate','Oujda':'Oujda','Rabat':'Rabat','Safi':'Safi','Settat':'Settat','Sal�':'Sal�','Tanger':'Tanger','Taza':'Taza','T�touan':'T�touan'}}" />
			</s:select>
			<input type="submit" value="Chercher"  class="buttonGeneral"/>
		</form>
	</div>
</div>