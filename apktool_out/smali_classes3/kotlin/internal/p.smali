.class public interface abstract annotation Lkotlin/internal/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lkotlin/internal/p;
        errorCode = -0x1
        level = .enum Lkotlin/m;->ERROR:Lkotlin/m;
        message = ""
        versionKind = .enum Lkotlin/internal/q;->LANGUAGE_VERSION:Lkotlin/internal/q;
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/internal/p$a;
    }
.end annotation

.annotation runtime Ljava/lang/annotation/Repeatable;
    value = Lkotlin/internal/p$a;
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->SOURCE:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->TYPE:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->METHOD:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->CONSTRUCTOR:Ljava/lang/annotation/ElementType;
    }
.end annotation

.annotation build Lkotlin/g1;
    version = "1.2"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008\u0081\u0002\u0018\u00002\u00020\u0001B0\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\nR\u000f\u0010\t\u001a\u00020\n\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\u000bR\u000f\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u000cR\u000f\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\rR\u000f\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\rR\u000f\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lkotlin/internal/RequireKotlin;",
        "",
        "version",
        "",
        "message",
        "level",
        "Lkotlin/DeprecationLevel;",
        "versionKind",
        "Lkotlin/internal/RequireKotlinVersionKind;",
        "errorCode",
        "",
        "()I",
        "()Lkotlin/DeprecationLevel;",
        "()Ljava/lang/String;",
        "()Lkotlin/internal/RequireKotlinVersionKind;",
        "kotlin-stdlib"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ln3/d;
.end annotation

.annotation runtime Ln3/e;
    value = .enum Ln3/a;->SOURCE:Ln3/a;
.end annotation

.annotation runtime Ln3/f;
    allowedTargets = {
        .enum Ln3/b;->CLASS:Ln3/b;,
        .enum Ln3/b;->FUNCTION:Ln3/b;,
        .enum Ln3/b;->PROPERTY:Ln3/b;,
        .enum Ln3/b;->CONSTRUCTOR:Ln3/b;,
        .enum Ln3/b;->TYPEALIAS:Ln3/b;
    }
.end annotation


# virtual methods
.method public abstract errorCode()I
.end method

.method public abstract level()Lkotlin/m;
.end method

.method public abstract message()Ljava/lang/String;
.end method

.method public abstract version()Ljava/lang/String;
.end method

.method public abstract versionKind()Lkotlin/internal/q;
.end method
