window.addEventListener('DOMContentLoaded', async () => {
    leftMenuToggle();
});

const leftMenuToggle = () => {
    const navContainer = document.querySelector('.st-nav-header-left-menu-container');
    const lefToggleMenu = document.querySelector('.st-div-header-left-menu');

    lefToggleMenu.addEventListener('click', () => {
        navContainer.classList.toggle('nav-menu-open');
        lefToggleMenu.classList.toggle('toggle-open');
    });
}
