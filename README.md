# 🚀 AR Book — Project Roadmap

An Android native app that enables parents to introduce reading to children using **Augmented Reality (AR)**. The app offers two types of books:

- 📖 **Mixed Mode:** A traditional book format (images + text) enhanced with interactive AR scenes on certain pages.
- 🌟 **Full AR Mode:** The entire book is presented in AR, with 3D scenes, characters, and text embedded in the real world.

---

## 📅 Roadmap

### ✅ Sprint 1 — Project Setup & Architecture
- [ ] Android project setup with modular structure (`:androidApp`, `:shared`)
- [ ] Implement Clean Architecture (Data, Domain, Presentation)
- [ ] Configure Jetpack Compose for UI
- [ ] Integrate AR engine (ARCore + Sceneview or alternative)
- [ ] Setup navigation (Compose Navigation)
- [ ] Setup basic Dependency Injection (Koin)
- [ ] (Optional) Setup CI/CD with GitHub Actions

---

### 🎨 Sprint 2 — UI/UX Foundation
- [-] Home screen with a list of books
- [-] Book detail screen
- [ ] Reader Mode UI for:
  - [ ] Mixed Mode (pages with AR triggers)
  - [ ] Full AR Mode (launches AR scenes directly)
- [ ] Implement dummy book repository (mocked data)

---

### 🌟 Sprint 3 — AR Integration PoC
- [ ] Integrate ARCore with surface detection and plane tracking
- [ ] Load a static 3D model into the AR scene
- [ ] Handle basic interactions (scale, rotate, move)
- [ ] Display one full AR scene as a proof of concept
- [ ] Link AR content to a Mixed Mode book page

---

### 📖 Sprint 4 — Book Content Parsing (Mixed Mode)
- [ ] Choose book format (e.g., JSON-based, EPUB, or HTML)
- [ ] Implement a basic parser to render pages
- [ ] Link pages with AR content through metadata
- [ ] UI for displaying page content with AR trigger buttons

---

### 🗂️ Sprint 5 — Model Management & Loading
- [ ] Manage 3D models (local or remote storage)
- [ ] Load models dynamically based on book/page
- [ ] Handle both static and animated models

---

### 🚀 Sprint 6 — Polish & Delivery
- [ ] Polish AR interactions (placement feedback, lighting adjustments)
- [ ] Implement basic error handling (e.g., no surface detected)
- [ ] Refine UI/UX (loading states, AR usage tips)
- [ ] Prepare a functional demo build
- [ ] Create documentation and presentation materials

---

## 🚦 Project Status
> 🏗️ Currently in development phase — working towards a PoC focused on AR scene rendering and book interaction.

---

## 📌 Future Improvements (Post-PoC)
- [ ] Audio narration and sound effects
- [ ] Advanced animations for 3D models
- [ ] Real-time collaborative AR (multi-device)
- [ ] Cloud-based content delivery for books and models
- [ ] Parental controls and screen time management

---

## 🛠️ Tech Stack
- **Language:** Kotlin
- **UI:** Jetpack Compose
- **AR:** ARCore + Sceneview (or alternative)
- **3D Model Format:** glTF (.gltf, .glb)
- **Architecture:** Clean Architecture (MVVM + Modular)
- **DI:** Koin
- **Navigation:** Compose Navigation
- **Build:** Gradle (KTS)
