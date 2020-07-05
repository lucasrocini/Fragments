package com.example.fragments.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragments.R;
import com.example.fragments.fragment.ContatosFragment;
import com.example.fragments.fragment.ConversasFragment;

public class MainActivity extends AppCompatActivity {

    private Button buttonConversas, buttonContatos;
    private ConversasFragment conversasFragment;
    private ContatosFragment contatosFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonConversas = findViewById(R.id.buttonConversas);
        buttonContatos = findViewById(R.id.buttonContatos);

        //remover sombra da actionbar
        getSupportActionBar().setElevation(0);

        conversasFragment = new ConversasFragment();

        //configurar objeto para exibir o fragmento
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        //transaction.add(R.id.frameConteudo,conversasFragment);
        transaction.replace(R.id.frameConteudo,conversasFragment);
        // aqui podem existir varias configuracoes no fragmento
        transaction.commit();

        buttonContatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contatosFragment = new ContatosFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo,contatosFragment);
                transaction.commit();
            }
        });

        buttonConversas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                conversasFragment = new ConversasFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo,conversasFragment);
                transaction.commit();
            }
        });

    }
}